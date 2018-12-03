void f(data, i)
{
    if(!CONDITION){return;}
    data = h(data)
    f(data, i+1)
}


void g(data)
{
    while(CONDITION)
    {
        data = h(data)
    }
}

