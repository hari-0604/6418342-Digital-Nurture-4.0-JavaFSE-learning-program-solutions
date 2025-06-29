-- Scenario 3: TransferFunds
CREATE OR REPLACE PROCEDURE TransferFunds(from_acct NUMBER, to_acct NUMBER, amt NUMBER) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = from_acct;
  IF v_balance < amt THEN
    RAISE_APPLICATION_ERROR(-20004, 'Insufficient balance');
  END IF;

  UPDATE Accounts SET Balance = Balance - amt WHERE AccountID = from_acct;
  UPDATE Accounts SET Balance = Balance + amt WHERE AccountID = to_acct;
  COMMIT;
END;
/
