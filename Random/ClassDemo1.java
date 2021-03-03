class student

{

    public : int marks;

            void disp()

            {

                        cout<<”its base class”

            };

            class topper:public student

            {

                        public :

                        void disp()

                        {

                                    cout<<”Its derived class”;

                        }

            }

            void main() { student s; topper t;

            s.disp();

            t.disp();

}

Group of answer choices
