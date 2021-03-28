import os


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
    file_name = 'Solution.' + lan

    if not os.path.exists(path):
        os.makedirs(path)

    if not os.path.exists(path + '/' + file_name):
        file = open(path + '/' + file_name, 'w')
        file.close()

    print('|' + num + '| [' + chinese_name + '](./all/' + num + '.' + englist_name +
          ') | [' + englist_name + '](./all/' + num + '.' + englist_name + ') | ' + difficulty + ' | ' + lan + ' |')
    print('✔ ' + num + ' ' + chinese_name + ' AC use ' + lan)
