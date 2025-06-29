-- Exercise 6: Cursors

-- Scenario 1: GenerateMonthlyStatements
DECLARE
  CURSOR c_trans IS
    SELECT * FROM Transactions WHERE EXTRACT(MONTH FROM TransactionDate) = EXTRACT(MONTH FROM SYSDATE);
  rec c_trans%ROWTYPE;
BEGIN
  OPEN c_trans;
  LOOP
    FETCH c_trans INTO rec;
    EXIT WHEN c_trans%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('Statement for Account ID ' || rec.AccountID || ': ' || rec.Amount);
  END LOOP;
  CLOSE c_trans;
END;
/
