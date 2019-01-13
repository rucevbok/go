using System;  
namespace DelegateExample {  
    public class EmployeeUtils {  
        public void FetchEmployeeDetails(string employeeId) {}  
        public void SaveEmployeeDetails(EmployeeModel employeeDetails) {}  
        public void ValidateEmployeeDetails(EmployeeModel employeeDetails) {}  
        public void ExportEmpDetailsToCSV(EmployeeModel employeDetails) {}  
        public void ImportEmpDetailsForDb(EmployeeModel employeeDetails) {}  
        private class EmployeeModel {  
            public string EmployeeId {  
                get;  
                set;  
            }  
            public string EmployeeName {  
                get;  
                set;  
            }  
            public string EmpplyeeAddress {  
                get;  
                set;  
            }  
            public string EmployeeDesignation {  
                get;  
                set;  
            }  
            public double EmployeeSalary {  
                get;  
                set;  
            }  
        }  
    }  
}  