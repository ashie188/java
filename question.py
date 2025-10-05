def check_validity(text: str) -> str:
    bracket_pairs = {')': '(', ']': '[', '}': '{', '>': '<'}
    stack = []
    
    for index, char in enumerate(text):
        if char in bracket_pairs.values():  # Opening brackets
            stack.append(char)
        elif char in bracket_pairs:  # Closing brackets
            if not stack or stack.pop() != bracket_pairs[char]:
                return f"Invalid: Mismatched or unmatched closing '{char}' at position {index}."
        elif not char.isalnum():  # Ignore alphanumeric characters
            return f"Invalid: Character '{char}' at position {index} is not allowed."
    
    if stack:  # Check for unmatched opening brackets
        return f"Invalid: Unmatched opening bracket(s) remaining: {stack}."
    
    return "valid"

def get_valid_invalid_text_count(texts: list) -> tuple:
    valid_count = 0
    invalid_count = 0

    for item in texts:
        if isinstance(item, str):  # Ensure the item is a string
            result = check_validity(item)
            if result == "valid":
                valid_count += 1
            else:
                invalid_count += 1
                print(f"Invalid text '{item}': {result}")
        else:
            print(f"Ignored non-string item: {item}")
    
    return valid_count, invalid_count


texts = ['[{(', 45, "()", '{[()]}', 'valid_string123', '(<>)', '{abc}']
print(get_valid_invalid_text_count(texts))
