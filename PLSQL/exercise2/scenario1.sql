-- Exercise 2: Error Handling

-- Scenario 1: SafeTransferFunds procedure with rollback on error
CREATE OR REPLACE PROCEDURE SafeTransferFunds(from_acct NUMBER, to_acct NUMBER, amt NUMBER) IS
BEGIN
  UPDATE Accounts SET Balance = Balance - amt WHERE AccountID = from_acct;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20001, 'From account not found');
  END IF;

  UPDATE Accounts SET Balance = Balance + amt WHERE AccountID = to_acct;
  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'To account not found');
  END IF;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
