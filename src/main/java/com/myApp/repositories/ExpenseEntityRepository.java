/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 *
 * @file: CCDetailsExcepRepository.java
 * @Date : Jul 12, 2018:2018:3:51:10 PM
 * @Updates : Jul 12, 2018:2018:3:51:10 PM
 **/
package com.myApp.repositories;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myApp.entity.ExpenseEntity;

// TODO: Auto-generated Javadoc
/*** The Interface CCDetailsExcepRepository. */

public interface ExpenseEntityRepository extends JpaRepository<ExpenseEntity, Timestamp> {

	/**
	 * Find by acc num.
	 *
	 * @param accNum
	 *        the acc num
	 * @return the list
	 */
	@Query("select x from ExpenseEntity")
	List<ExpenseEntity> findAllExpense(BigDecimal accNum);

}
