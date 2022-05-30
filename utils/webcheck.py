from urllib import request
import json

host = "https://cat-fact.herokuapp.com/facts"


def get_resp(url: str) -> str:
    resp = request.urlopen(url)
    x = resp.read()
    x = x.decode("UTF-8")
    x = json.loads(x)
    return x[0]["text"]


if __name__ == "__main__":
    print(get_resp(host))