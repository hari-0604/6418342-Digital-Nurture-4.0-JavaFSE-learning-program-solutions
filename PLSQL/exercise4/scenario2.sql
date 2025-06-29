-- Scenario 2: CalculateMonthlyInstallment
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(amount NUMBER, rate NUMBER, years NUMBER) RETURN NUMBER IS
  monthly_rate NUMBER := rate / (12 * 100);
  months NUMBER := years * 12;
BEGIN
  RETURN amount * monthly_rate / (1 - POWER(1 + monthly_rate, -months));
END;
/
