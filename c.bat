javac -encoding utf8 %1.java
@if %ERRORLEVEL% == 0 (
java %1
)

