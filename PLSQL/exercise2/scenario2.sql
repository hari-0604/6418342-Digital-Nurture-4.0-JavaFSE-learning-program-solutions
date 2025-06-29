-- Scenario 2: UpdateSalary procedure
CREATE OR REPLACE PROCEDURE UpdateSalary(emp_id NUMBER, pct NUMBER) IS
BEGIN
  UPDATE Employees SET Salary = Salary + (Salary * pct / 100) WHERE EmployeeID = emp_id;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20003, 'Employee not found');
  END IF;
  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/
