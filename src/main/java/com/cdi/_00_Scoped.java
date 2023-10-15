
package com.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

// scoped movzusu
// life cycle (yasam dongusu)

@Named

// @ApplicationScoped  // Btutun aplikasiya boyu yasiyir, butun istifadeciler ucun
// @RequestScoped   // Bir istek boyunca yasiyir 
// @SessionScoped  //  Bir istifadeci ucun yasiyir
// @Dependent  //  Daxilinde cagirildigi kalss skopunu alir 
// @ConversationScoped  //  Melum istek boyunca yasiyir

public class _00_Scoped {
    
}
