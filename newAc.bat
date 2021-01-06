@echo off
cd all
@REM dir

@REM get param
set /p id=请输入英文题目(id.english_name):
md %id%

cd %id%
set /p lan=请输入AC语言:
echo=> Solution.%lan%

@REM 生成markdown内容
