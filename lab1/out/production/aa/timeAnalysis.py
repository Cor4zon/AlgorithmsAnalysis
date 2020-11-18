import matplotlib.pyplot as plt
import numpy as np

# Линейная зависимость
x = [10, 110, 210, 310, 410, 510, 610, 710, 810, 910]
# yLevenstein = []
yLevensteinMatrix = [69530, 608135, 444960, 952249, 2225428, 4172473, 4970914, 7327315, 6019199, 7153123]
yDameradLevenstein = [96104, 801438, 1199348, 1910891, 3092926, 3566122, 4742909, 4805360, 5141034,5904520]

# Построение графика
# plt.stackplot(10, 10, labels=["Levenstein Matrix", "Damerad-Levenstein"])
plt.title("Time analysis")
plt.xlabel("String length")
plt.ylabel("Time(nanosecunds)")


plt.grid()
plt.plot(x, yLevensteinMatrix, label="Levenstein")
plt.plot(x, yDameradLevenstein, label="Damerad-Levenstein")
plt.legend()

plt.show()