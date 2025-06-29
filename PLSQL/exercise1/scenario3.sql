-- Scenario 3: Send loan due reminders within 30 days
BEGIN
  FOR rec IN (SELECT * FROM Loans WHERE EndDate <= SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for customer ID ' || rec.CustomerID || ' is due soon.');
  END LOOP;
END;
/
