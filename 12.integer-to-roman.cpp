/*
 * @lc app=leetcode id=12 lang=cpp
 *
 * [12] Integer to Roman
 */
class Solution
{
public:
    string intToRoman(int num)
    {
        string roman = "";
        roman.append(num / 1000, 'M');
        num %= 1000;
        if (num >= 900)
        {
            roman += "CM";
            num -= 900;
        }
        if (num >= 500)
        {
            roman += "D";
            num -= 500;
        }
        if (num >= 400)
        {
            roman += "CD";
            num -= 400;
        }
        roman.append(num / 100, 'C');
        num %= 100;
        if (num >= 90)
        {
            roman += "XC";
            num -= 90;
        }
        if (num >= 50)
        {
            roman += "L";
            num -= 50;
        }
        if (num >= 40)
        {
            roman += "XL";
            num -= 40;
        }
        roman.append(num / 10, 'X');
        num %= 10;
        if (num >= 9)
        {
            roman += "IX";
            num -= 9;
        }
        if (num >= 5)
        {
            roman += "V";
            num -= 5;
        }
        if (num >= 4)
        {
            roman += "IV";
            num -= 4;
        }
        roman.append(num, 'I');
        return roman;
    }
};
