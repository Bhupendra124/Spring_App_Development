package com.demo.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeBean {
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean;

    public EmployeeBean() {
    }

    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on constructor ***");
        this.deptBean = deptBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    /**
     * Purpose : DepartmentBean is autowired into EmployeeBean at setter level.
     */

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("*** Autowiring by using @Autowire annotation on Setter ***");
        this.deptBean = deptBean;
    }

    /**
     * Purpose : Print the EmployeeBean property values in the logger file
     */

    public void showEmployeeDetails() {
        logger.debug("Employee Id : {}", eid);
        logger.debug("Employee Name : {}", ename);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}", deptBean.getDeptName());
    }
}


