import matplotlib.pyplot as plt

x = [10, 110, 210, 310, 410, 510, 610, 710, 810, 910]
yLevensteinMatrix = [69432.0,
                     630201.0,
                     488263.0,
                     1057711.0,
                     2590602.0,
                     4293640.0,
                     4366677.0,
                     5482179.0,
                     5691209.0,
                     7316105.0]

yDameradLevenstein = [93742.0,
                      1362326.0,
                      1585825.0,
                      1282857.0,
                      2670328.0,
                      3342887.0,
                      3830212.0,
                      4069107.0,
                      4073625.0,
                      4536573.0]

plt.title("Time analysis")
plt.xlabel("String length")
plt.ylabel("Time(nanosecunds)")

plt.grid()
plt.plot(x, yLevensteinMatrix, label="Levenstein")
plt.plot(x, yDameradLevenstein, label="Damerad-Levenstein")
plt.legend()

plt.show()
