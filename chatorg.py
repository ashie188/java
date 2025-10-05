import time

def odd_even1(l):
    odd_count = 0
    for num in l:
        if isinstance(num, (int, float)):  # Ensure the value is numeric
            odd_count += num % 2
    return odd_count, len(l) - odd_count

def odd_even2(l):
    odd_count = 0
    for num in l:
        if isinstance(num, (int, float)) and num % 2 != 0:  # Ensure the value is numeric
            odd_count += 1
    return odd_count, len(l) - odd_count

def checkPerformance(approaches):
    time_taken = []
    # Test case with only numbers to avoid type errors
    test = [1, 2, 22, 121, 123, 456, 789]

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
        percentage_faster.append((approaches[i].__name__, percentage_diff))

    return time_taken, percentage_faster

# Example usage:
approaches = [odd_even1, odd_even2]
times, faster = checkPerformance(approaches)

print("Time taken:", times)
print("Percentage faster:", faster)
