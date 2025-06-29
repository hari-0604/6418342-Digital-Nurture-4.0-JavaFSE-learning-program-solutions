-- Scenario 2: ApplyAnnualFee
DECLARE
  CURSOR c_acc IS SELECT * FROM Accounts;
  rec c_acc%ROWTYPE;
BEGIN
  FOR rec IN c_acc LOOP
    UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = rec.AccountID;
  END LOOP;
END;
/
