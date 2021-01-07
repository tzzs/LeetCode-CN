@echo off
cd all
@REM dir

@REM get id
set /p id=请输入ID: 

@REM get chinese name
set /p chinese_name=请输入中文题目(chinese_name): 

@REM get english_name
set /p english_name=请输入英文题目(english_name): 

set floder=%id%.%english_name%

md %floder%

cd %floder%

set /p lan=请输入AC语言: 
echo=> Solution.%lan%


@REM 生成markdown内容
echo | %id% | [%chinese_name%](./all/%floder%) | [%english_name%](./all/%floder%) |  | %lan% |


@REM 生成commit内容

echo "%id% %chinese_name% use %lan% "
