def odd_even1(l):
    odd_count = 0

    for num in l:
        odd_count += num % 2

    return odd_count, len(l) - odd_count


def odd_even2(l):
    odd_count = 0

    for num in l:
        if num % 2 != 0:
            odd_count += 1

    return odd_count, len(l) - odd_count



test2 = [1, 2, 3, 4, 5, 6, 7]

import time


def checkPerformance(approaches):
    time_taken = []
    # test = [1, 2, 3, 4, 5, 6, 7]
    test = [(1, 2, 22, 121, "bbb", ["bbb", 121]), [], "aba", "bbb",]

    for approach in approaches:
        start_time = time.time()
        for _ in range(100000):
            approach(test)
        end_time = time.time()
        time_taken.append(end_time - start_time)

    first_approach_time = time_taken[0]
    percentage_faster = []

    for i in range(1, len(approaches)):
        percentage_diff = ((first_approach_time - time_taken[i]) / first_approach_time) * 100
        percentage_faster.append((approaches[i]._name_, percentage_diff))

    return time_taken, percentage_faster