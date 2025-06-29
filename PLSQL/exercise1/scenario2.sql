-- Scenario 2: Promote customer to VIP if balance > 10000
BEGIN
  FOR rec IN (SELECT * FROM Customers) LOOP
    IF rec.Balance > 10000 THEN
      UPDATE Customers SET IsVIP = 'Y' WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
END;
/
