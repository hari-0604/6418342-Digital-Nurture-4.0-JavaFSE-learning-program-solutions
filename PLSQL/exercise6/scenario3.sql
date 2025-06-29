-- Scenario 3: UpdateLoanInterestRates
DECLARE
  CURSOR c_loan IS SELECT * FROM Loans;
  rec c_loan%ROWTYPE;
BEGIN
  FOR rec IN c_loan LOOP
    UPDATE Loans SET InterestRate = InterestRate * 1.02 WHERE LoanID = rec.LoanID;
  END LOOP;
END;
/
