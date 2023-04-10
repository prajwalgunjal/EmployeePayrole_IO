package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeePayrollService {


    ArrayList<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList=employeePayrollList;
    }

    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :- ");
        int id=sc.nextInt();
        System.out.println("Enter Name :- ");
        String name=sc.next();
        System.out.println("Enter salary :- ");
        double salary=sc.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
    public void write(){
        System.out.println(employeePayrollList);
    }

    public static void main(String[] args) {
         ArrayList<EmployeePayrollData> employeePayrollList= new ArrayList<>();
         EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        employeePayrollService.read();
        employeePayrollService.write();
    }
}
