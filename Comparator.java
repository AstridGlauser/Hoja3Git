//iNTERFAZ A implementar

import java.util.Vector;

/*
 * @param <T> can be any object to sort
 */

public interface Comparator<T> {
public void sort(Vector<T> data);
}
/*
          _____                    _____             _____                    _____                    _____                   _______         
         /\    \                  /\    \           /\    \                  /\    \                  /\    \                 /::\    \        
        /::\    \                /::\    \         /::\    \                /::\____\                /::\    \               /::::\    \       
       /::::\    \              /::::\    \        \:::\    \              /:::/    /               /::::\    \             /::::::\    \      
      /::::::\    \            /::::::\    \        \:::\    \            /:::/    /               /::::::\    \           /::::::::\    \     
     /:::/\:::\    \          /:::/\:::\    \        \:::\    \          /:::/    /               /:::/\:::\    \         /:::/~~\:::\    \    
    /:::/__\:::\    \        /:::/__\:::\    \        \:::\    \        /:::/    /               /:::/__\:::\    \       /:::/    \:::\    \   
   /::::\   \:::\    \      /::::\   \:::\    \       /::::\    \      /:::/    /               /::::\   \:::\    \     /:::/    / \:::\    \  
  /::::::\   \:::\    \    /::::::\   \:::\    \     /::::::\    \    /:::/    /      _____    /::::::\   \:::\    \   /:::/____/   \:::\____\ 
 /:::/\:::\   \:::\    \  /:::/\:::\   \:::\____\   /:::/\:::\    \  /:::/____/      /\    \  /:::/\:::\   \:::\____\ |:::|    |     |:::|    |
/:::/  \:::\   \:::\____\/:::/  \:::\   \:::|    | /:::/  \:::\____\|:::|    /      /::\____\/:::/  \:::\   \:::|    ||:::|____|     |:::|    |
\::/    \:::\  /:::/    /\::/   |::::\  /:::|____|/:::/    \::/    /|:::|____\     /:::/    /\::/   |::::\  /:::|____| \:::\    \   /:::/    / 
 \/____/ \:::\/:::/    /  \/____|:::::\/:::/    //:::/    / \/____/  \:::\    \   /:::/    /  \/____|:::::\/:::/    /   \:::\    \ /:::/    /  
          \::::::/    /         |:::::::::/    //:::/    /            \:::\    \ /:::/    /         |:::::::::/    /     \:::\    /:::/    /   
           \::::/    /          |::|\::::/    //:::/    /              \:::\    /:::/    /          |::|\::::/    /       \:::\__/:::/    /    
           /:::/    /           |::| \::/____/ \::/    /                \:::\__/:::/    /           |::| \::/____/         \::::::::/    /     
          /:::/    /            |::|  ~|        \/____/                  \::::::::/    /            |::|  ~|                \::::::/    /      
         /:::/    /             |::|   |                                  \::::::/    /             |::|   |                 \::::/    /       
        /:::/    /              \::|   |                                   \::::/    /              \::|   |                  \::/____/        
        \::/    /                \:|   |                                    \::/____/                \:|   |                   ~~              
         \/____/                  \|___|                                     ~~                       \|___|                                   
                                                                                                                                               
*/