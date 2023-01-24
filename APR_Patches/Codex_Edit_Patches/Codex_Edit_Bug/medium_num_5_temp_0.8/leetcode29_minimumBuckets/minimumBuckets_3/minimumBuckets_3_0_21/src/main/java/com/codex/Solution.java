package com.codex;

import java.util.*;

public class Solution {
package com.walgreens.oms.dao;

import com.walgreens.common.constant.PhotoOmniDBConstants;
import com.walgreens.common.exception.PhotoOmniException;
import com.walgreens.oms.bean.Employee;
import com.walgreens.oms.bean.EmployeeFilter;
import com.walgreens.oms.bean.EmployeeInfoBean;
import com.walgreens.oms.bean.JsonResponse;
import com.walgreens.oms.dao.EmployeeDAO;
import com.walgreens.oms.query.EmployeeQuery;
import com.walgreens.oms.utility.CommonUtil;
import com.walgreens.oms.utility.JsonUpdateHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private JsonUpdateHelper jsonUpdateHelper = new JsonUpdateHelper();

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeDAOImpl.class);

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public List<Employee> getEmployees(EmployeeFilter filter)
			throws PhotoOmniException {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(" Entering getEmployees method of EmployeeDAOImpl ");
		}
		List<Employee> employeeList = null;
		String query = EmployeeQuery.getEmplyeeDetailsQuery().toString();
		try {
			employeeList = this.jdbcTemplate.query(query,
					new Object[] { filter.getStoreNumber() },
					new ResultSetExtractor<List<Employee>>() {

						public List<Employee> extractData(ResultSet rs)
								throws SQLException, DataAccessException {
							List<Employee> employeeList = new ArrayList<Employee>();
							while (rs.next()) {
								Employee emp = new Employee();
								emp.setEmpId(rs
										.getString(PhotoOmniDBConstants.EMPLOYEE_SYS_ID));
								emp.setEmpName(rs
										.getString(PhotoOmniDBConstants.EMPLOYEE_NAME));
								employeeList.add(emp);
							}
							return employeeList;
						}
					});
		} catch (Exception e) {
			LOGGER.error(" Error occoured at getEmployees method of EmployeeDAOImpl - "
					+ e);
			throw new PhotoOmniException(e.getMessage());
		} finally {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(" Exiting getEmployees method of EmployeeDAOImpl ");
			}
		}
		return employeeList;
	}

	public EmployeeInfoBean getEmployeeInfo(String selectedEmpId)
			throws PhotoOmniException {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(" Entering getEmployeeInfo method of EmployeeDAOImpl ");
		}
		EmployeeInfoBean empBean = new EmployeeInfoBean();
		String query = EmployeeQuery.getEmplyeeInfoQuery().toString();
		try {
			SqlRowSet srs = this.jdbcTemplate.queryForRowSet(query,
					new Object[] { selectedEmpId });
			if (srs.next()) {
				empBean.setEmployee(CommonUtil
						.convertStringToCharArray(srs
								.getString(PhotoOmniDBConstants.EMPLOYEE_NAME)));
				empBean.setEmployeeType(CommonUtil
						.convertStringToCharArray(srs
								.getString(PhotoOmniDBConstants.EMPLOYEE_TYPE)));
				empBean.setActive(CommonUtil
						.convertStringToCharArray(srs
								.getString(PhotoOmniDBConstants.ACTIVE)));
				empBean.setHourlyRate(CommonUtil
						.convertStringToCharArray(srs
								.getString(PhotoOmniDBConstants.EMPLOYEE_HOURLY_RATE)));
			}
		} catch (Exception e) {
			LOGGER.error(" Error occoured at getEmployeeInfo method of EmployeeDAOImpl - "
					+ e);
			throw new PhotoOmniException(e.getMessage());
		} finally {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(" Exiting getEmployeeInfo method of EmployeeDAOImpl ");
			}
		}
		return empBean;
	}

	public JsonResponse updateEmployeeInfo(EmployeeInfoBean empBean)
			throws PhotoOmniException {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(" Entering updateEmployeeInfo method of EmployeeDAOImpl ");
		}
		JsonResponse jsonResponse = null;
		Map<String, Object> updateColumnNameWithValues = new HashMap<String, Object>();
		updateColumnNameWithValues.put(PhotoOmniDBConstants.EMPLOYEE_NAME,
				empBean.getEmployee());
		updateColumnNameWithValues.put(PhotoOmniDBConstants.EMPLOYEE_HOURLY_RATE,
				empBean.getHourlyRate());
		updateColumnNameWithValues.put(PhotoOmniDBConstants.EMPLOYEE_TYPE,
				empBean.getEmployeeType());
		updateColumnNameWithValues.put(PhotoOmniDBConstants.ACTIVE,
				empBean.getActive());
		try {
			jsonResponse = jsonUpdateHelper.jsonUpdate(updateColumnNameWithValues,
					PhotoOmniDBConstants
    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}