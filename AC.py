"""
leetcode ac script

desc:

"""
import os
from time import gmtime, strftime


if __name__ == '__main__':
    num = input('请输入ID:')
    if num.isdigit():
        num = '0' * (4 - len(str(num))) + num

    chinese_name = input('请输入中文题目(chinese_name):')
    englist_name = input('请输入英文题目(english_name):')
    lan = input('请输入AC语言:')
    lan = lan.lower()
    DIFFICULTY = input('请输入难度:')

    if DIFFICULTY == '简单' or DIFFICULTY == '1':
        DIFFICULTY = 'easy'
    elif DIFFICULTY == '中等' or DIFFICULTY == '2':
        DIFFICULTY = 'medium'
    elif DIFFICULTY == '困难' or DIFFICULTY == '3':
        DIFFICULTY = 'hard'

    DIFFICULTY = DIFFICULTY.lower()

    path = os.getcwd() + '/all/' + num + '.' + englist_name

    if lan == 'c++':
        FILE_TYPE = 'cpp'
    elif lan == 'python':
        FILE_TYPE = 'py'
    else:
        FILE_TYPE = lan
    file_name = 'Solution.' + FILE_TYPE

    if not os.path.exists(path):
        os.makedirs(path)

    FILE_PATH = ""
    if not os.path.exists(path + '/' + file_name):
        FILE_PATH = path + '/' + file_name
        file = open(FILE_PATH, 'w')
        file.close()
    else:
        FILE_PATH = path + '/' + 'Solution_' + \
            strftime("%Y-%m-%d-%H-%M-%S", gmtime())+'.' + FILE_TYPE
        file = open(FILE_PATH, 'w')
        file.close()

    dir_path = './all/' + num + '.' + englist_name
    readme_txt = '|' + num + '| [' + chinese_name + '](./all/' + num + '.' + englist_name + \
        ') | [' + englist_name + '](./all/' + num + '.' + englist_name + \
        ') | ' + DIFFICULTY + ' | ' + lan + ' |'
    print(readme_txt)

    commit_msg = '✔ ' + num + ' ' + chinese_name + ' AC use ' + lan
    print(commit_msg)

    # update problems infomation to README.md
    with open("README.md", "r", encoding='utf-8') as f:
        content = f.readlines()

        if num.isnumeric():
            for i, line in enumerate(content):
                if line.startswith('|'):
                    cur = line.split('|')[1].strip()
                    if cur.isnumeric():
                        cur = int(cur)
                        if cur > int(num):
                            content.insert(i, readme_txt + '\n')
                            break
        else:
            content.insert(len(content) + 1, readme_txt + '\n')

    with open("README.md", "w", encoding='utf-8') as f:
        f.writelines(content)

    # open file in current vscode window
    os.system('code -r ' + FILE_PATH)

    # wait for write code to the file
    os.system('pause')

    # commit ac code and push to github
    os.system('git add ' + dir_path)
    os.system('git add README.md')
    os.system('git commit -m "' + commit_msg + '"')
    os.system('git push')
