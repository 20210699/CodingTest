def solution():
    import sys
    input = sys.stdin.read
    data = input().splitlines()
    
    n, m = map(int, data[0].split())
    
    unheard = set(data[1:n+1])  # 듣도 못한 사람의 이름들을 해시 테이블로 저장 (set)
    unseen = set(data[n+1:n+1+m])  # 보도 못한 사람의 이름들을 해시 테이블로 저장 (set)
    
    # 두 집합의 교집합을 구함 (듣도 보도 못한 사람)
    unheard_and_unseen = sorted(unheard & unseen)
    
    # 결과 출력
    print(len(unheard_and_unseen))
    print("\n".join(unheard_and_unseen))

# 함수 실행
solution()
