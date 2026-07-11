SET SERVEROUTPUT ON;

BEGIN

FOR l IN (

SELECT LoanID,CustomerID,DueDate
FROM Loans
WHERE DueDate BETWEEN SYSDATE AND SYSDATE+30

)

LOOP

DBMS_OUTPUT.PUT_LINE(
'Reminder : Customer '
|| l.CustomerID ||
' Loan '
|| l.LoanID ||
' Due on '
|| l.DueDate
);

END LOOP;

END;
/