import sys

def solve():
    input = sys.stdin.read
    data = input().split()
    
    if not data:
        return
    
    T = int(data[0])
    results = []
    
    for i in range(1, T + 1):
        X_str = data[i]
        if '7' in X_str:
            results.append("YES")
        else:
            results.append("NO")
            
    print('\n'.join(results))

if __name__ == '__main__':
    solve()
