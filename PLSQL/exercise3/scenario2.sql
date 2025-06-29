-- Scenario 2: UpdateEmployeeBonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept VARCHAR2, bonus_pct NUMBER) IS
BEGIN
  UPDATE Employees SET Salary = Salary + (Salary * bonus_pct / 100)
  WHERE Department = dept;
END;
/
