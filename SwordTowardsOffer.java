#46 �߼��������ӷ� 
public int Add(int num1,int num2) {
        	while(num2!=0){
            // �����λ
            int temp = num1 ^ num2;
            // �����λ��1+1��
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1; 
    }

#47 �ַ����ֱ�
    public int StrToInt(String str) {
        if (str == null || str.length() == 0)
            return 0;
        int mark = 0;
        int number = 0;
        char[] chars = str.toCharArray();
        if (chars[0] == '-')
            mark = 1;
        for (int i = mark; i < chars.length; i++) {
            if (chars[i] == '+') {
                continue;
            }
            if (chars[i] < 48 || chars[i] > 57) {
                return 0;
            }
            number = number * 10 + chars[i] - 48;
        }
        return mark == 0 ? number : -number;
    }