@echo off
cd all
@REM dir

@REM get id
set /p a=������ID: 

set id=%a%
set /a b=^%a%*1
setlocal EnableDelayedExpansion
if %b% equ %a% (
    Set "id=0000!id!"
    Set "id=!id:~-4,4!"
)

set a=!id!

@REM get chinese name
set /p chinese_name=������������Ŀ(chinese_name): 

@REM get english_name
set /p english_name=������Ӣ����Ŀ(english_name): 

set floder=%a%.%english_name%

md %floder%

cd %floder%

set /p LAN=������AC����: 

set LAN_LOWER=%LAN%

@REM str to lower

for %%i in (a b c d e f g h i j k l m n o p q r s t u v w x y z) do call set LAN_LOWER=%%LAN_LOWER:%%i=%%i%%


echo=> Solution.%LAN_LOWER%


@REM ����markdown����
echo "| %a% | [%chinese_name%](./all/%floder%) | [%english_name%](./all/%floder%) |  | %lan% |"


@REM ����commit����

echo "%a% %chinese_name% use %lan% "
