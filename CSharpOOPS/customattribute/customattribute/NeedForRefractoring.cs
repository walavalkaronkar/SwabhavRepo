using System;


namespace customattribute
{
    [AttributeUsage(
   AttributeTargets.Class |
   AttributeTargets.Constructor |
   AttributeTargets.Field |
   AttributeTargets.Method |
   AttributeTargets.Property,
   AllowMultiple = true)]
    class NeedForRefractoring: Attribute
    {
        public NeedForRefractoring()
        {
            //Console.WriteLine("Constructor called");
        }
    }
}
