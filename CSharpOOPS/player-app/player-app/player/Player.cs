using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace player_app.player
{
    class Player
    {
        private int _id;
        private string _name;
        private int _age;
        private static int _playerId = 101;

        public Player(string name, int age)
        {
            _id = _playerId++;
            _name = name;
            _age = age;
        }

        public Player(string name) : this(name, 18)
        {
            //this(id, name, 18);
        }

        

        public int Id
        {
            get
            {
                return _id;
            }
        }

        public string Name
        {
            get
            {
                return _name;
            }
        }

        public int Age
        {
            get
            {
                return _age;
            }
        }

        public Player whoIsElder(Player playerTwo)
        {
            if (this.Age > playerTwo.Age)
            {
                return this;
            }
            return playerTwo;
        }
    }
}
