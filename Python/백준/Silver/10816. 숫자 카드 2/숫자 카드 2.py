from collections import Counter
import sys

def solution():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])  # 상근이가 가진 숫자 카드의 개수
    cards = list(map(int, data[1:n+1]))  # 숫자 카드에 적힌 정수들
    m = int(data[n+1])  # 몇 개 가지고 있는지 구해야 할 숫자의 개수
    queries = list(map(int, data[n+2:n+2+m]))  # 구해야 할 M개의 정수
    
    # 숫자 카드의 빈도를 세는 Counter 객체 생성
    card_counter = Counter(cards)
    
    # 각 쿼리에 대해 숫자 카드의 개수를 구함
    result = [str(card_counter[query]) for query in queries]
    
    # 결과를 공백으로 구분해 출력
    sys.stdout.write(" ".join(result) + "\n")

# 함수 실행
solution()
