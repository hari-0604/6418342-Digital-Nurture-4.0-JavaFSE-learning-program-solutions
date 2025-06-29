-- Exercise 4: Functions

-- Scenario 1: CalculateAge
CREATE OR REPLACE FUNCTION CalculateAge(dob DATE) RETURN NUMBER IS
BEGIN
  RETURN FLOOR(MONTHS_BETWEEN(SYSDATE, dob) / 12);
END;
/
