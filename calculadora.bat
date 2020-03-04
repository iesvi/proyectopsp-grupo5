@echo off

 :start

Echo Presiona 1 para Sumar

echo Presiona 2 para Restar

echo Presiona 3 para Multiplicar

echo Presiona 4 para Dividir

echo Presiona 5 para Salir

set /p type=

if %type%==1 goto a

if %type%==2 goto b

if %type%==3 goto c

if %type%==4 goto d

if %type%==5 goto e

 :a

echo Addition

echo Please choose the 2 numbers you wish to add

set /p num1=

set /p num2=

echo %num1%+%num2%?

pause

set /a Answer=%num1%+%num2%

echo %Answer%

pause

goto start

 :b

echo Subtraction

echo Please choose the 2 numbers you wish to subtract

set /p num1=

set /p num2=

echo %num1%-%num2%?

pause

set /a Answer=%num1%-%num2%

echo %Answer%

pause

goto start

 :c

echo Multiplication

echo Please choose the 2 numbers you wish to multiply

set /p num1=

set /p num2=

echo %num1%*%num2%?

pause

set /a Answer=%num1%*%num2%

echo %Answer%

pause

goto start

 :d

echo Division

echo Please choose the 2 numbers you wish to divide

set /p num1=

set /p num2=

echo %num1%/%num2%?

pause

set /a Answer=%num1%/%num2%

echo %Answer%

pause

goto start

 :e

echo. Done!