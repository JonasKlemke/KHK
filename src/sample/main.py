import os
import time
import random

timeOutSec = 10111 + random.randrange(0,1000)
sourcefile = "/Users/fklemke/jPyWorkspace/Controller.java"
targetfile = str(random.randrange(0,99909)) + ".txt"



while True:
    with open(sourcefile) as inF:
        lines = inF.readlines()

        for i in range(0, len(lines)):
            line = lines[i]

            with open(targetfile, "a") as outF:
                outF.write(lines[random.randrange(0,len(lines))] + "," + lines[random.randrange(0,len(lines))] + "," + lines[random.randrange(0,len(lines))] + "," + lines[random.randrange(0,len(lines))])

    os.system("git add .")
    comMsg = random.randrange(0,9992992992)
    os.system("git commit -m '%d'" % comMsg)
    os.system("git push origin master")
    time.sleep(timeOutSec)
