@echo off
 Title : Script Menu Basico


:menu

echo A - Calculadora
echo B - Bloco de Notas
Echo C - Paint

choice /c ABC /m "O que deseja executar?"


IF errorlevel==3 goto paint
IF errorlevel==2 goto blocodenotas
IF errorlevel==1 goto calc


:blocodenotas
start notepad
pause
goto menu

:calc
start calc
pause
goto menu

:paint 
start mspaint 
pause
goto menu
