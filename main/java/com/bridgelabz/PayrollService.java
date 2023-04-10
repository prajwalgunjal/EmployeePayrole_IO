package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface PayrollService {
    void writeData(List<EmployeePayrollData> list) throws IOException;
    void readData() throws IOException;

    long count() throws IOException;

}