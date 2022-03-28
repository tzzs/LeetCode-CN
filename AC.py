"""
leetcode ac script

desc:

"""
import os
from time import gmtime, strftime


if __name__ == '__main__':
    num = input('请输入ID:')
    if num.isdigit():
        num = '0'*(4-len(str(num))) + num

    chinese_name = input('请输入中文题目(chinese_name):')
    englist_name = input('请输入英文题目(english_name):')
    lan = input('请输入AC语言:')
    lan = lan.lower()
    difficulty = input('请输入难度:')

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

    if not os.path.exists(path + '/' + file_name):
        file = open(path + '/' + file_name, 'w')
        file.close()
    else:
        file = open(path + '/' + 'Solution_' +
                    strftime("%Y-%m-%d-%H-%M-%S", gmtime())+'.' + FILE_TYPE, 'w')
        file.close()

    dir_path = './all/' + num + '.' + englist_name
    readme_txt = '|' + num + '| [' + chinese_name + '](./all/' + num + '.' + englist_name + ') | [' + \
        englist_name + '](./all/' + num + '.' + englist_name + \
        ') | ' + difficulty + ' | ' + lan + ' |'
    print(readme_txt)

    commit_msg = '✔ ' + num + ' ' + chinese_name + ' AC use ' + lan
    print(commit_msg)

    with open("README.md", "r", encoding='utf-8') as f:
        content = f.readlines()

        for i, line in enumerate(content):
            if line.startswith('|'):
                cur = line.split('|')[1].strip()
                if cur.isnumeric():
                    cur = int(cur)
                    if cur > int(num):
                        content.insert(i, readme_txt + '\n')
                        break

    with open("README.md", "w", encoding='utf-8') as f:
        f.writelines(content)

    os.system('pause')
    os.system('git add ' + dir_path)
    os.system('git add README.md')
    os.system('git commit -m "' + commit_msg + '"')
    os.system('git push')
