package doit.algorithm;

import java.util.Comparator;

public class LinkedList<E> {
	
	class Node<E> {
		private E data;
		private Node<E> next;

		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head;
	private Node<E> crnt;
	
	public LinkedList() {
		head = crnt = null;
	}
	
	// 노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // 현재 스캔 중인 노드
		
		while(ptr !=null) {
			if(c.compare(obj,  ptr.data) == 0) { // 검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next; // 다음 노드를 선택
		}
		return null; // 검색 실패
	}
	
	// 머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
	}
	
	// 꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head==null)
			addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next!=null)
				ptr = ptr.next;
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	// 머리 노드를 삭제
	public void removeFirst() {
		if(head!=null) // 리스트가 비어 있지 않으면
			head = crnt = head.next;
	}
	
	// 꼬리 노드를 삭제
	public void removeLast() {
		if(head!=null) {
			if(head!=null) {
				if(head.next==null) // 노드가 하나만 있으면
					removeFirst(); // 머리 노드 삭제
				else {
					Node<E> ptr = head;
					Node<E> pre = head;
					
					while(ptr.next!=null) {
						pre = ptr;
						ptr = ptr.next;
					}
					pre.next = null; // pre는 삭제 후의 꼬리 노드
					crnt = pre;
				}
			}
		}
	}
	
	// 노드 p를 삭제
	public void remove(Node p) {
		if(head!=null) {
			if(p==head) // p가 머리 노드면
				removeFirst(); // 머리 노드를 삭제
			else {
				Node<E> ptr = head;
				
				while(ptr.next!=p) {
					ptr = ptr.next;
					if(ptr==null) return; // p가 리스트에 엇음
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	// 선택 노드를 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	// 모든 노드를 삭제
	public void clear() {
		while(head!=null)
			removeFirst();
		crnt = null;
	}
	
	// 선택 노드를 하나 뒤쪽으로 진행
	public boolean next() {
		if(crnt==null || crnt.next==null)
			return false;
		crnt = crnt.next;
		return true;
	}
	
	// 선택 노드를 출력
	public void printCurrentNode() {
		if(crnt==null)
			System.out.println("선택한 노드가 없습니다.");
		else
			System.out.println(crnt.data);
	}
	
	// 모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}