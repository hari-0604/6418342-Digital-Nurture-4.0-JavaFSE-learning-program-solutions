-- Scenario 2: LogTransaction
CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
  INSERT INTO AuditLog VALUES (NEW.TransactionID, SYSDATE, 'Inserted transaction');
END;
/
