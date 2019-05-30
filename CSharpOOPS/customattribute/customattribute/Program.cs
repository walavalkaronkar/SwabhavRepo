using System;
using System.Reflection;
using customattribute;

namespace customattribute
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(MyClass);
            Type t1 = typeof(NeedForRefractoring);
            MemberInfo[] members = t.GetMembers();

            foreach(MemberInfo member in members)
            {
                Attribute attribute=member.GetCustomAttribute(typeof(NeedForRefractoring),true);
                //Console.WriteLine(attribute);
                if((attribute!= null))
                {
                    Console.WriteLine(member.Name);
                }

            }


        }
    }
}
