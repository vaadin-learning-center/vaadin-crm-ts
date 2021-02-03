import { InvalidSessionMiddleware } from '@vaadin/flow-frontend';
import { setSessionExpired } from '../store/auth';

export const invalidSessionMiddleware = new InvalidSessionMiddleware(
  async () => {
    setSessionExpired();
    const { LoginView } = await import ('../components/login-view/login-view');
    return LoginView.openAsPopup();
  }
);
