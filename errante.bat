@echo off
setlocal
cd /d "%~dp0"
for /d %%J in ("%~dp0.tools\java25\jdk-*") do set "JAVA_HOME=%%~fJ"
set "GRADLE_USER_HOME=%~dp0.gradle-user"
call "%~dp0gradlew.bat" %*
exit /b %errorlevel%
