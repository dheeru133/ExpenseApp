package com.myApp.entity;

/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 *
 * @file: EntityListener.java
 * @Date : Jul 12, 2018:2018:3:49:14 PM
 * @Updates : Jul 12, 2018:2018:3:49:14 PM
 **/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.PostLoad;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving trim events.
 *
 * @see TrimEvent
 */
public class EntityListener {

	/**
	 * The Interface Trim.
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	public @interface Trim {
	}

	/** The trim properties. */
	private final Map<Class<?>, Set<Field>> trimProperties = new HashMap<>();

	/**
	 * Repair after load.
	 *
	 * @param entity
	 *        the entity
	 * @throws Exception
	 *         the exception
	 */
	@PostLoad
	public void repairAfterLoad(final Object entity) throws Exception {
		for (final Field fieldToTrim : getTrimProperties(entity.getClass())) {
			final String propertyValue = (String) fieldToTrim.get(entity);
			if (propertyValue != null) fieldToTrim.set(entity, propertyValue.trim());
		}
	}

	/**
	 * Gets the trim properties.
	 *
	 * @param entityClass
	 *        the entity class
	 * @return the trim properties
	 * @throws Exception
	 *         the exception
	 */
	private Set<Field> getTrimProperties(Class<?> entityClass) throws Exception {
		if (Object.class.equals(entityClass)) return Collections.emptySet();
		Set<Field> propertiesToTrim = trimProperties.get(entityClass);
		if (propertiesToTrim == null) {
			propertiesToTrim = new HashSet<>();
			for (final Field field : entityClass.getDeclaredFields())
				if (field.getType().equals(String.class) && (field.getAnnotation(Trim.class) != null)) {
					field.setAccessible(true);
					propertiesToTrim.add(field);
				}
			trimProperties.put(entityClass, propertiesToTrim);
		}
		return propertiesToTrim;
	}
}
