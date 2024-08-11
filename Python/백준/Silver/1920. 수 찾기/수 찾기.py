def solution():
    # 입력을 받아 처리합니다.
    n = int(input())
    a = set(map(int, input().split()))
    m = int(input())
    queries = list(map(int, input().split()))
    
    # 각 쿼리마다 해당 숫자가 set에 존재하는지 확인
    for q in queries:
        if q in a:
            print(1)
        else:
            print(0)

# 함수 실행
solution()
