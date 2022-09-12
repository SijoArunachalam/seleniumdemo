import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("abcd");
		name.add("defe");
		name.add("accddd");
		
		ArrayList<String> name1ne=new ArrayList<String>();
		name.add("orange");
		name.add("apple");
		name.add("accddd");
		
		Long c=name.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		name.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		name.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Stream newstream=(Stream) java.util.stream.Stream.concat(name.stream(), name1ne.stream()).collect(Collectors.toList());
		//System.out.println(newstream);

	}

}
