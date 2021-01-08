@echo off
cd all
@REM dir

@REM get id
set /p id=请输入ID: 

Set "id=0000%id%"
Set "id=%id:~-4,4%"

@REM get chinese name
set /p chinese_name=请输入中文题目(chinese_name): 

@REM get english_name
set /p english_name=请输入英文题目(english_name): 

set floder=%id%.%english_name%

md %floder%

cd %floder%

set /p LAN=请输入AC语言: 

set LAN_LOWER=%LAN%

@REM str to lower

for %%i in (a b c d e f g h i j k l m n o p q r s t u v w x y z) do call set LAN_LOWER=%%LAN_LOWER:%%i=%%i%%


echo=> Solution.%LAN_LOWER%


@REM 生成markdown内容
echo "| %id% | [%chinese_name%](./all/%floder%) | [%english_name%](./all/%floder%) |  | %lan% |"


@REM 生成commit内容

echo "%id% %chinese_name% use %lan% "
