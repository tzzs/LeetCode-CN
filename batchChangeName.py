import os

if __name__ == "__main__":
    files = os.listdir('all')
    print(files)

    for file in files:
        num = file[0]
        if num >= '0' and num <= '9':
            n = file.split('.')

            oldname = os.path.join('all/' + file)
            newname = os.path.join('all/' + '0'*(4-len(n[0]))+file)
            # os.rename()
            # print(oldname, newname)
            os.rename(oldname, newname)
    pass
